#Java Core Home Work 5 by Istomin Sergey, group 6413
![HW5](https://github.com/Sistomin/JavaCoreHW5/blob/main/Img.PNG)

1. Написать функцию, создающую резервную копию всех файлов в директории (без
поддиректорий) во вновь созданную папку ./backup
____________________________
Решение
Для работы используем пакеты java.nio.file и java.io. 
Создаем класс BackupUtility с необходимыми методами. Здесь "./source" и "./backup" это путь папкам. 
source - от куда копируем. backup - куда копируем.
