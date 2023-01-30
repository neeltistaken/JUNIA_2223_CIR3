# Projet d’Électronique : Simon

## Objectifs du projet

L’objectif de ce projet est double :

- Il permet de mettre au point, assembler et tester un montage électronique dont la fonction peut aisément être mise en évidence. Dans la continuité de la formation théorique, le but recherché est de mettre en pratique les connaissances acquises en électronique numérique, et faire découvrir par l’expérimentation les principales étapes de développement d’un système électronique.
- Il est représentatif des systèmes numériques actuels, pour lesquels on trouve :
	+ l'acquisition de signaux issus de l’environnement,
	+ le traitement numérique de l’information,
	+ la mise en œuvre d’actionneurs en fonction de l’information reçue.

## Présentation du sujet

Le projet consiste à concevoir le circuit dérivé du jeu « Simon ». Ce jeu consiste à générer aléatoirement une séquence de sons et de couleurs à l’aide d’un buzzer et de 4 LEDs RGB (Red-Green-Blue) adressables individuellement. A l’aide de boutons poussoir, il s’agit ensuite de reconstituer la séquence dans l’ordre. Si on y arrive, la séquence se complexifie au fur et à mesure, et si on n’y arrive pas, la séquence est remise à zéro.

Le jeu pourra être alimenté par un générateur de tension, mais il est également prévu de pouvoir l’alimenter par une pile 9V.

## Notes 

### Listes des IO

| **Périphérique** | **Pin** | **Intitulé**         | **Registre**     |
|------------------|---------|----------------------|------------------|
| CLKOUT           | 10      | RA6/ANA6/CLKOUT/OSC2 |                  |
| Buzzer           | 12      | RC1/ANC1/CCP2        | PORTC/TRISC/LATC |
| LED0             | 15      | RC4/ANC4/SDI1/SDA1   | PORTC/TRISC/LATC |
| LED1             | 16      | RC5/ANC5             | PORTC/TRISC/LATC |
| LED2             | 17      | RC6/ANC6/TX1         | PORTC/TRISC/LATC |
| LED3             | 18      | RC7/ANC7/RX1         | PORTC/TRISC/LATC |
| BP0              | 21      | RB0/ANB0/INT0        | PORTB/TRISB/LATB |
| BP1              | 22      | RB1/ANB1/INT1        | PORTB/TRISB/LATB |
| BP2              | 23      | RB2/ANB2/INT2        | PORTB/TRISB/LATB |
| BP3              | 24      | RB3/ANB3             | PORTB/TRISB/LATB |
| CMD LEDS         | 26      | RB5/ANB5             | PORTB/TRISB/LATB |

### Clock

On a choisi $16MHz$ de fréquence $f$, c'est à dire que l'oscillateur interne envoie une impulsion toutes les $62,5ns$.

### Diagramme d'état

[![](https://mermaid.ink/img/pako:eNp1kLFqwzAQhl9F3FjipaOGDm3IUMhU8FJ1uErn5MC2gnwKKSEP5Ofwi_ViJZhAq-nn03fi9J_Bx0BgYRAUWjPuEnbV8dn1Rs_n05epqheznsbvLIWVPOM3bH1ujTWvMUvszSHRMExj8W6XV--dcmEaZlBPY-KGPQrr2N_zj86yheobzKf_pJq9RE6kWp2Qb9odLs_ACjpKHXLQz5-vmgPZU0cOrMZADeZWHLj-oirqfh8_vQcrKdMK8iEsdYFtsB2UUmCJaVsKnXu9_ALBC3eI?type=png)](https://mermaid.live/edit#pako:eNp1kLFqwzAQhl9F3FjipaOGDm3IUMhU8FJ1uErn5MC2gnwKKSEP5Ofwi_ViJZhAq-nn03fi9J_Bx0BgYRAUWjPuEnbV8dn1Rs_n05epqheznsbvLIWVPOM3bH1ujTWvMUvszSHRMExj8W6XV--dcmEaZlBPY-KGPQrr2N_zj86yheobzKf_pJq9RE6kWp2Qb9odLs_ACjpKHXLQz5-vmgPZU0cOrMZADeZWHLj-oirqfh8_vQcrKdMK8iEsdYFtsB2UUmCJaVsKnXu9_ALBC3eI) 

