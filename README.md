# Wisielec

Jak wlaczyc?
odpalamy vsc wrzucamy wszystkie pliki z tego repozytorium, odpalamy program gameui.java

Jak grac?
Grac w wisielca chyba kazdy umie, jezeli nie to tutaj podaje kolejne kroki rozgrywki:
1.Kliknij start
2.Zgaduj pojedynczo litery i klikaj Enter
3.Zgadnieta litera pojawi sie na ekranie w hasle, niezgadnieta obok - odejmie Ci to jedna probe. Masz ich tylko 6.
4.Wygrywasz albo przegrywasz zalezy czy zgadles

Lista i opis zaimplementowanych funkcji:

Losowanie Słowa - po kliknieciu start losowo wybiera sie slowo
Zgadywanie Liter - sprawdzanie czy litera wystepuje w hasle
Sledznie liter - jezeli w slowie jakas litera sie powtarza, zostanie wpisana tyle razy ile znajduje sie w hasle przy pierwszym zgadnieciu
Liczba prob - ograniczona do 6
wygrana - wyskakuje okienko mowiace o wygranej
przegrana - wyskakuje okienko mowiace o przegranej

Spis tresci
Program sklada sie z:

HangmanGame.java
glowny kod gry

WordManager.java
kod zarzadzajacy haslami

GameUI.java
interface tego cudownego programu

words.txt
hasla do zgadniecia

