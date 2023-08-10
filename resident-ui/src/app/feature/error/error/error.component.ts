import { Component, OnInit } from '@angular/core';
import { LoginRedirectService } from 'src/app/core/services/loginredirect.service';

@Component({
  selector: 'app-error',
  templateUrl: './error.component.html',
  styleUrls: ['./error.component.css']
})
export class ErrorComponent implements OnInit {

  constructor(
    private redirectService: LoginRedirectService
  ) { }

  ngOnInit() {
  }
  login(){
    this.redirectService.redirect(window.location.href);
  }
}
