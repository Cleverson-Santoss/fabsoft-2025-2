import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormEmpresa } from './form-empresa';

describe('FormEmpresa', () => {
  let component: FormEmpresa;
  let fixture: ComponentFixture<FormEmpresa>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormEmpresa]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormEmpresa);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
