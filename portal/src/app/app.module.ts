import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppBootstrapModule } from './app-bootstrap/app-bootstrap.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { EditDetailComponent } from './edit-detail/edit-detail.component';
import { RouterModule, Routes } from '@angular/router';
import { SignUpComponent } from './sign-up/sign-up.component';
import { HomeComponent } from './home/home.component';

const appRoutes: Routes = [
  { path: 'sign_up', component: SignUpComponent },
  { path: 'home', component: HomeComponent },
  { path: 'edit_detail/:id',      component: EditDetailComponent },
  { path: 'login', component: LoginComponent },
  { path: '**', component: LoginComponent }
];
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    EditDetailComponent,
    SignUpComponent,
    HomeComponent
  ],
  imports: [
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    ),
    NgbModule.forRoot(),
    AppBootstrapModule,
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
