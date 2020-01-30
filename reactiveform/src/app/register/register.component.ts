import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  RegisterForm: FormGroup;
  Submitted = false;
  InvalidLogin = false;


  constructor(private formBuilder: FormBuilder) { }
  onSubmit() {
    this.Submitted = true;
    if (this.RegisterForm.invalid) {
      return;
   } if(this.RegisterForm.controls.email.value === 'some@email.com'
         && this.RegisterForm.controls.password.value === 'password'){
            console.log('welocme');
   }
    else { this.InvalidLogin = true;
     }

  }
  ngOnInit() {
    this.RegisterForm = this.formBuilder.group({
      id: ['', Validators.required] ,
      name: ['', [ Validators.required , Validators.maxLength(20), Validators.pattern('^[a-zA-Z ]*$')] ],
      email: ['', [ Validators.required , Validators.email]],
      mobile: ['', [ Validators.required ,  Validators.maxLength(10), Validators.pattern('^[0-9]$')]],
      password: ['', [ Validators.required , Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}')]]
    });
  }

}
