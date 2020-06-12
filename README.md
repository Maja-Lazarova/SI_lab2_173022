# Втора лабораториска вежба по Софтверско инженерство
Маја Лазарова, 173022

Група на код:
Ја добив група 2

Control Flow Graph:
<img src="https://user-images.githubusercontent.com/63316754/84451605-e1df6b00-ac53-11ea-8aed-ab4706bdf3af.png">

Цикломатска комплексност:

Тест случаи според Every Bnarch:
A-B, A-C, C-D, C-E, E-F, E-G, E-H, G-H, H-I, B-I
  Се генерираат test cases кои ги посетуваат двата исходи од одлуката

Тест случаи според Multiple condition:
if(user==null): T,F;
if (user.getUsername()==null || allUsers.contains(user.getUsername())): T||X, F||T,  F||F
if (user.getEmail()==null): T, F
if (user.getEmail().charAt(i)=='@'): T, F
if (atChar && user.getEmail().charAt(i)=='.'): T&&T, T&&F, F&&X, 
if (!atChar || !dotChar):T||X, F||T, F||F
Се еволуираат сите јазли во кои се врши одлучување.

Unit tests:
Се користи анотацијата @Test, и се испишуваат горните случаеви за дали корисничкото име е валидно.

