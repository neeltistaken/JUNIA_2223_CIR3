---
title: Courbes polynomiales
author: Rémi VAN BOXEM
institute: JUNIA
subject: Introduction à l'infographie
year: 2022
---
# Courbes polynomiales
![[Pasted image 20220911201857.png]] Les points rouges correspondent aux points $(x_k, y_k)$, et la courbe bleue représente le polynôme d'interpolation.
## Définition
Polynôme d'interpolation de degré $n$ :
$$P(x)=\sum^n_{i=0}a_iQ_i(x)$$
Où :
- $Q_i = \{\alpha _0(t),...,\alpha _n(t)\}$ **base** de l'espace vectoriel des polynômes de degré $\leq n$ 
- **$a_i$ coefficients** réels 
### Méthodes et conditions
- **Interpolation**
	- Base canonique *(polynôme interpolant)*
	- Base de Lagrange *(polynôme de Lagrange)*
	- Base de Newon *(polynôme de Newton)*
	- **Interpolation par morceaux**
		- Linéaire
		- Polynôme cubique d’Hermite
		- Splines
- **Approximation**
	- Méthode de moindres carrés
- **Modélisation**
	- Base de Bernstein *(courbe de Bézier)*
	- **Modélisation par morceaux**
		- Base B-spline *(Courbes B-splines)*
		- Base B-spline rationnelle *(NURBS)*

## Interpolation polynomiale
### Base canonique
