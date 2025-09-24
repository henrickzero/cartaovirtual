import { Component, OnInit, AfterViewInit, ElementRef, ViewChild } from '@angular/core';
import * as AOS from 'aos';
import * as feather from 'feather-icons';

@Component({
  selector: 'app-virtual-card',
  templateUrl: './virtual-card.component.html',
  styleUrls: ['./virtual-card.component.css']
})
export class VirtualCardComponent implements OnInit, AfterViewInit {
  @ViewChild('card', { static: true }) card!: ElementRef;

  profile = {
    name: 'João Silva',
    title: 'Diretor de Produtos e Soluções',
    whatsapp: '(11) 98765-1111',
    whatsappLink: 'https://wa.me/5511987654321',
    email: 'joao.silva@empresa.com',
    phone: '(11) 98765-4321',
    location: 'São Paulo, Brasil',
    locationLink: 'https://maps.google.com/?q=São Paulo, Brasil',
    website: 'dataprev.gov.br',
    username: 'joao.silva',
    socialLinks: [
      { url: '#', icon: 'linkedin' },
      { url: '#', icon: 'map' },
      { url: '#', icon: 'save' },
      { url: '#', icon: 'share-2' }
    ]
  };

  constructor() {}

  ngOnInit(): void {
    AOS.init();
  }

  ngAfterViewInit(): void {
    feather.replace(); // Call feather.replace() after the view is initialized
  }

  onMouseMove(event: MouseEvent): void {
    const cardElement = this.card.nativeElement;
    const cardRect = cardElement.getBoundingClientRect();
    const cardCenterX = cardRect.left + cardRect.width / 2;
    const cardCenterY = cardRect.top + cardRect.height / 2;

    const mouseX = event.clientX - cardCenterX;
    const mouseY = event.clientY - cardCenterY;

    const rotateY = mouseX / 30;
    const rotateX = -mouseY / 30;
    const scale = 1.01;

    cardElement.style.transform = `
      perspective(1000px)
      rotateX(${rotateX}deg)
      rotateY(${rotateY}deg)
      scale(${scale})
    `;
    cardElement.style.boxShadow = `0 15px 30px -5px rgba(0, 0, 0, 0.15)`;
  }

  onMouseLeave(): void {
    const cardElement = this.card.nativeElement;
    cardElement.style.transform = 'rotateX(0) rotateY(0) scale(1)';
    cardElement.style.boxShadow = '0 10px 15px -3px rgba(0, 0, 0, 0.1)';
  }
}