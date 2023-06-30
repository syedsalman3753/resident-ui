import { Component, OnInit, OnDestroy } from "@angular/core";
import { Router } from "@angular/router";
import { TranslateService } from "@ngx-translate/core";
import { DataStorageService } from "src/app/core/services/data-storage.service";
import { AppConfigService } from 'src/app/app-config.service';
import { Subscription } from "rxjs";
import { AuditService } from "src/app/core/services/audit.service";
import { BreakpointService } from "src/app/core/services/breakpoint.service";
import { LoginRedirectService } from 'src/app/core/services/loginredirect.service'

@Component({
  selector: "app-dashboard",
  templateUrl: "./dashboard.component.html",
  styleUrls: ["./dashboard.component.css"],
})
export class DashboardComponent implements OnInit, OnDestroy {

  menuItems:any;
  message:any;
  subscriptions: Subscription[] = [];
  userPreferredLangCode = localStorage.getItem("langCode");
  cols : number;
  
  constructor(
    private router: Router,
    private dataStorageService: DataStorageService,
    private translateService: TranslateService,
    private appConfigService: AppConfigService,
    private auditService: AuditService,
    private breakPointService: BreakpointService,
    private redirectService: LoginRedirectService
  ) {
    this.breakPointService.isBreakpointActive().subscribe(active =>{
      if (active) {
        if(active === "extraSmall"){
          this.cols = 1;
        }
        if(active === "small"){
          this.cols = 1;
        }
        if(active === "medium"){
          this.cols = 2;
        }
        if(active === "large"){
          this.cols = 3;
        }
        if(active === "ExtraLarge"){
          this.cols = 3;
        }
      }
    });
  }

  async ngOnInit() {
    this.translateService.use(localStorage.getItem("langCode")); 
    this.translateService
    .getTranslation(this.userPreferredLangCode)
    .subscribe(response => {
      this.menuItems = response.menuItems;
    });
  }

  onItemSelected(item: any) {
    if(item === "UIN Services"){
      this.redirectService.redirect(window.location.href.split("#")[0]+"#/uinservices/dashboard");
    }else if(item === "Get Information"){
      this.router.navigate(["regcenter"])
    }else if(item === "Booking an Appointment"){
      this.auditService.audit('RP-043', 'Book an appointment', 'RP-Book an appointment', 'Book an appointment', 'User clicks on "book an appointment" card');
      window.open(this.appConfigService.getConfig()["mosip-prereg-ui-url"], "_blank");
    }else{
     this.router.navigate([item]); 
   }    
  }

  ngOnDestroy(): void {
    this.subscriptions.forEach((subscription) => subscription.unsubscribe());
  }
}
