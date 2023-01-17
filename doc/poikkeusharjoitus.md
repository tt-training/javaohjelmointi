# Poikkeukset

Toteuta yksinkertainen laskin, joka lukee komentoriviltä laskutoimituksia ja suorittaa ne.
Tällainen laskin löytyy jo valmiina luokasta `fi.tieturi.kurssi.LaskinPohja`. Tehtävänä on vain toteuttaa kunnollinen poikkeuskäsittely.

## `fi.tieturi.kurssi.LaskinPohja`

Luokka toteuttaa laskimen, joka lukee laskutoimituksia komentoriviltä, suorittaa laskut ja tulostaa tuloksen.
Laskin tukee peruslaskutoimituksia +, -, * ja /. Oletettu laskutoimituksen muoto on "luku1  op luku2", jossa
*luku1* ja *luku2* ovat kokonaislukuja ja *op* on operaattori. Huomaa että lukujen ja operaattorin välissä on oltava välilyönti, eli "1 + 2" kelpaa, mutta "1+2" ei kelpaa. (Komentoriviltä syötettynä lainausmerkkejä ei anneta.) 

Ohjelman käyttö voisi olla seuraavaa:

```
Anna laskutoimitus:
3 + 4
Tulos: 7
Anna laskutoimitus:
5 - 12
Tulos: -7
Anna laskutoimitus:
37 / 5
Tulos: 7
Anna laskutoimitus:
```

Nykyisessä muodossaan ohjelma voi loppua vain virheeseen. Tätä tehtävässä ei tarvitse muuttaa,
mutta muokkaa koodia siten että ohjelma ei kaadu virheisiin, vaan antaa kussakin tilanteessa
sopivan kuvaavan virheilmoituksen.
