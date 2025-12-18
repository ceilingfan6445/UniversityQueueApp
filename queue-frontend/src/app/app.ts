import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  title = 'University Queue';
  studentName: string = '';
  studentId: string = '';
  queueList: any[] = [];

  constructor(private http: HttpClient) {}

  fetchQueue() {
    this.http.get<any[]>('http://localhost:8080/queue/show')
      .subscribe(data => {
        this.queueList = data;
      });
  }

  joinQueue() {
    const url = `http://localhost:8080/queue/join?name=${this.studentName}&id=${this.studentId}`;

    this.http.post(url, {}, { responseType: 'text'})
      .subscribe(response => {
        alert(response);
        this.fetchQueue();
      })
  }

  serveStudent() {
    this.http.get('http://localhost:8080/queue/next', { responseType: 'text' })
      .subscribe(response => {
        alert(response);
        this.fetchQueue();
      })
  }
}
