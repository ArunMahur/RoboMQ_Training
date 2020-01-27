import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  employees = [
    {"id":"Identity No.","name":"Name","salary":"Salary","department":"Department"},
    {"id":1,"name":"Arun","salary":"2348980","department":"IT"},
    {"id":2,"name":"Suraj","salary":"32483","department":"HR"},
    {"id":3,"name":"Hitanshu","salary":"438422","department":"Sales"},
    {"id":4,"name":"Daulat","salary":"949230","department":"Marketing"}
];;
  constructor() { }

  ngOnInit() {
  }

}
