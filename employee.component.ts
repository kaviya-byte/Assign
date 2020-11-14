import { Component, OnInit } from '@angular/core';  
  
@Component({  
  selector: 'app-employee',  
  templateUrl: './employee.component.html',  
  styleUrls: ['./employee.component.css']  
})  
export class EmployeeComponent {  
  
  firstName:string="Farhan";  
  lastName:string="Ahmed";  
  age:number=32;  
  position:string="Software Developer";  
  office:string="Bangalore";  
  salary:number=65000;  
}