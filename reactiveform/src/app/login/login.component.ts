import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  Submitted: boolean ;
  InvalidLogin = false;
  constructor( private formBuilder: FormBuilder ) { }
  onSubmit() {
    this.Submitted = true;
    if (this.loginForm.invalid) {
      return;
    }
    if ( this.loginForm.controls.mail.value === 'some@email.com'
    && this.loginForm.controls.password.value === 'password' ) {console.log("welcome");}
    else {
         this.InvalidLogin = true;
    }
  }
  ngOnInit(): void {
  this.loginForm = this.formBuilder.group({
      mail: ['', [Validators.required, Validators.email ] ] ,
      password: ['', [Validators.required, Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}')]]
    });
  }

}
