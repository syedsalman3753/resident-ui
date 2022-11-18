import { NgModule } from '@angular/core';
import { Routes, RouterModule, PreloadAllModules } from '@angular/router';
import { AuthguardService } from './core/services/authguard.service';

const routes: Routes = [
  { path: '', redirectTo: 'dashboard', pathMatch: 'full' },
  { path: 'dashboard', loadChildren: 'src/app/feature/dashboard/dashboard.module#DashboardModule'}, 
  {path:'getuin', loadChildren:"src/app/feature/getuin/getuin.module#GetuinModule"},
  { path: 'document', loadChildren: 'src/app/feature/document/document.module#DocumentModule'},
  { path: 'regcenter', loadChildren: 'src/app/feature/booking/booking.module#BookingModule'},
  { path: 'verify', loadChildren:'src/app/feature/verify/verify.module#VerifyModule'},
  { path: 'uinservices', loadChildren:'src/app/feature/uinservices/uinservices.module#UinservicesModule'},
  {path:'bookappointment',loadChildren:'src/app/feature/bookappointment/bookappointment.module#BookappointmentModule'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true, preloadingStrategy: PreloadAllModules, onSameUrlNavigation: 'reload' })],
  exports: [RouterModule]
})
export class AppRoutingModule { }

