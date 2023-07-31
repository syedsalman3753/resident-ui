import { Component, OnInit, Input, EventEmitter, Output } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { TranslateService } from "@ngx-translate/core";

@Component({
  selector: "app-captcha",
  templateUrl: "./captcha.component.html",
  styleUrls: ["./captcha.component.css"],
})
export class CaptchaComponent implements OnInit {
  @Input() captchaSiteKey: string;
  @Input() resetCaptcha: boolean;
  @Output() captchaEvent = new EventEmitter<string>();
  langCode: string = localStorage.getItem("langCode");
  captchaLangCode:any;
  constructor(private activatedRoute: ActivatedRoute,private translateService: TranslateService,) {}

  ngOnInit() {
    this.translateService
    .getTranslation('default')
      .subscribe(response => {
          this.captchaLangCode = response.keyboardMapping[this.langCode]
      })
    
    setTimeout(() => {
      const iframeGoogleCaptcha = document.getElementById("recaptcha-container").querySelector('iframe');
      // const currentLang = iframeGoogleCaptcha.getAttribute("src").match(/hl=(.*?)&/).pop();
      // if (currentLang !== lang) {
          iframeGoogleCaptcha.setAttribute(
              "src",
              iframeGoogleCaptcha.getAttribute("src").replace(
                  /hl=(.*?)&/,
                  'hl=' + this.captchaLangCode + '&'
              )
          );
      // }
    }, 180);
  }

  ngOnChanges(): void {
    if (this.resetCaptcha) this.handleReset();
  }

  recaptcha(captchaResponse: any) {
    console.log(`Resolved captcha with response: ${captchaResponse}`);
      this.captchaEvent.emit(captchaResponse);
   }

  recaptchaError(event) {
    alert(event);
  }

  handleReset() {
    //grecaptcha.reset();
  }
}
