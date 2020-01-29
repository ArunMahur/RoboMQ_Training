import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-post-table',
  templateUrl: './post-table.component.html',
  styleUrls: ['./post-table.component.css']
})
export class PostTableComponent implements OnInit {

@Input() empDetails = [];
  constructor() { }

  ngOnInit() {
  }

}
