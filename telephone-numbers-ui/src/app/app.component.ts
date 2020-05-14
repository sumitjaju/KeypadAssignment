import { Component, ViewChild, OnInit, ElementRef, AfterViewInit, OnDestroy } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { createOfflineCompileUrlResolver } from '@angular/compiler';

declare var $;

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, AfterViewInit{
  title = 'telephone-numbers-ui';
  pageSize : number =  10;
  totalRecords : number = 0;
  pageLabelArray : [];
  phoneNumberList;

  @ViewChild ('dataTable') table : ElementRef;
  dataTable:any;
  dataOptions: any;
  tableStatus: any;
  constructor(private http: HttpClient) {
  }

  ngOnInit ():void {
  }

  ngAfterViewInit() {
    this.dataTable = $(this.table.nativeElement);
  }

  onCreatePost(postData: { phoneNumber: string }) {

    this.http.post(
      'http://localhost:8080/phoneNumbers', postData
    ).subscribe (responseData => {
      console.log("Response Data: "+JSON.stringify(responseData));
      this.phoneNumberList = responseData ;
      this.totalRecords = this.phoneNumberList.length;
      this.tableStatus = this.dataTable.DataTable({
        "pageLength": 10,
        "iDisplayLength": 10,
        "info":true,
        data: this.phoneNumberList,
        "bDestroy": true,
        columns: [
          {"data":"phoneNumber"}
        ]
      });

    });
  }

}
