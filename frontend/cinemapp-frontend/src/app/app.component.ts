import {Component, Inject, OnInit} from '@angular/core';
import {RouterLink, RouterLinkActive, RouterModule, RouterOutlet} from '@angular/router';
import { NavbarComponent } from './core/navbar/navbar.component';
import { FooterComponent } from './core/footer/footer.component';
import { ToolbarModule } from 'primeng/toolbar';
import { ButtonModule } from 'primeng/button';
import { CardModule } from 'primeng/card';
import { FilmService } from './services/film.service';
import {Film} from './model/film';
import {NgForOf} from '@angular/common';
import {CinemaListComponent} from './features/cinema-list/cinema-list.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, NavbarComponent, FooterComponent, ButtonModule, ToolbarModule, CardModule, NgForOf, RouterLink, RouterLinkActive, CinemaListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent implements OnInit {
  title = 'cinemapp-frontend';

  films: Film[] = [];
  constructor(private filmService: FilmService) {
  }
  ngOnInit() {
    this.filmService.getFilms().subscribe(films => {this.films = films;});
  }



}
