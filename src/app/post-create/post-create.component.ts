import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-post-create',
  templateUrl: './post-create.component.html',
  styleUrls: ['./post-create.component.css']
})
export class PostCreateComponent implements OnInit {
  @Output() data = new EventEmitter();

  id = '';
  name = '';
  salary = '';
  dept = '';


  constructor() { }

  onSave() {
  const emp = {
      id : this.id,
      name: this.name,
      salary : this.name,
      dept: this.dept
    };

  this.data.emit(emp);
  console.log('>>>>>', emp);
  }

ngOnInit() {

}

}
