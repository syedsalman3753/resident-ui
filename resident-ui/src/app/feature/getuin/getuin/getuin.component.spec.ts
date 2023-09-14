import { ComponentFixture, TestBed, tick, fakeAsync } from '@angular/core/testing';
import { GetuinComponent } from './getuin.component';
import { Router } from '@angular/router';
import { TranslateService } from '@ngx-translate/core';
import { AppConfigService } from 'src/app/app-config.service';
import { DataStorageService } from 'src/app/core/services/data-storage.service';
import { MatDialog } from '@angular/material';
import { AuditService } from 'src/app/core/services/audit.service';
import { BreakpointService } from 'src/app/core/services/breakpoint.service';
import { of } from 'rxjs';

describe('GetuinComponent', () => {
  let component: GetuinComponent;
  let fixture: ComponentFixture<GetuinComponent>;
  let routerSpy: jasmine.SpyObj<Router>;
  let translateService: jasmine.SpyObj<TranslateService>;
  let appConfigServiceSpy: jasmine.SpyObj<AppConfigService>;
  let dataStorageServiceSpy: jasmine.SpyObj<DataStorageService>;
  let dialogSpy: jasmine.SpyObj<MatDialog>;
  let auditServiceSpy: jasmine.SpyObj<AuditService>;
  let breakpointServiceSpy: jasmine.SpyObj<BreakpointService>;

  beforeEach(() => {
    routerSpy = jasmine.createSpyObj('Router', ['navigate']);
    translateService = jasmine.createSpyObj('TranslateService', ['use', 'getTranslation']);
    appConfigServiceSpy = jasmine.createSpyObj('AppConfigService', ['getConfig']);
    dataStorageServiceSpy = jasmine.createSpyObj('DataStorageService', ['getStatus', 'generateOTPForUid']);
    dialogSpy = jasmine.createSpyObj('MatDialog', ['open']);
    auditServiceSpy = jasmine.createSpyObj('AuditService', ['audit']);
    breakpointServiceSpy = jasmine.createSpyObj('BreakpointService', ['isBreakpointActive']);

    TestBed.configureTestingModule({
      declarations: [GetuinComponent],
      providers: [
        { provide: Router, useValue: routerSpy },
        { provide: TranslateService, useValue: translateService },
        { provide: AppConfigService, useValue: appConfigServiceSpy },
        { provide: DataStorageService, useValue: dataStorageServiceSpy },
        { provide: MatDialog, useValue: dialogSpy },
        { provide: AuditService, useValue: auditServiceSpy },
        { provide: BreakpointService, useValue: breakpointServiceSpy },
      ],
    });

    fixture = TestBed.createComponent(GetuinComponent);
    component = fixture.componentInstance;
  });

  it('should create the GetuinComponent', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize component properties on ngOnInit', () => {
    const mockResponse = {
      uinservices: {},
      InfomationContent: {
        getUin: 'Some info $AID $UIN $VID',
      },
      uinStatus: {
        statusStages: {},
      },
    };
    translateService.getTranslation.and.returnValue(of(mockResponse));
    appConfigServiceSpy.getConfig.and.returnValue({});

    component.ngOnInit();

    expect(component.getUinData).toBeDefined();
    expect(component.popupMessages).toBeDefined();
    expect(component.infoText).toBeDefined();
    expect(component.getStatusData).toBeDefined();
    expect(component.stageKeys).toBeDefined();
  });

  it('should handle onItemSelected correctly', () => {
    component.onItemSelected('home');
    expect(routerSpy.navigate).toHaveBeenCalledWith(['dashboard']);

    component.onItemSelected('back');
    expect(routerSpy.navigate).toHaveBeenCalledWith(['getuin']);
  });

  it('should handle getUserID correctly', () => {
    component.getUserID('1234567890');
    expect(component.disableSendOtp).toBeFalse();

    component.getUserID('12345');
    expect(component.disableSendOtp).toBeFalse();

    component.getUserID('12345a');
    expect(component.disableSendOtp).toBeTrue();
  });

  // Add more test cases as needed for other methods and scenarios
});
