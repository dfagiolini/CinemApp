import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CinemaService {
  private apiUrl = 'http://localhost:8080/api/cinema'; // Modifica con il tuo backend

  constructor(private http: HttpClient) {}

  getCinemas(): Observable<any> {
    return this.http.get<any>(this.apiUrl);
  }
}
