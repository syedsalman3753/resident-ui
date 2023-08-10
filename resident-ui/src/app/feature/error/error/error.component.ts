import { Component, OnInit } from '@angular/core';
import { LoginRedirectService } from 'src/app/core/services/loginredirect.service';

@Component({
  selector: 'app-error',
  templateUrl: './error.component.html',
  styleUrls: ['./error.component.css']
})
export class ErrorComponent implements OnInit {
  redirectUrl:string;
  constructor(
    private redirectService: LoginRedirectService
  ) { }

  ngOnInit() {
   let urlData = window.location.href.split('#', )
   this.redirectUrl = urlData[0] + "/#/" + "uinservices/dashboard"
  }
  login(){
    this.redirectService.redirect(this.redirectUrl);
  }
}
