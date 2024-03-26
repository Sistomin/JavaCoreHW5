#Java Core Home Work 5 by Istomin Sergey, group 6413
![HW5](https://github.com/Sistomin/JavaCoreHW5/blob/main/Img.PNG)

1. Написать функцию, создающую резервную копию всех файлов в директории (без
поддиректорий) во вновь созданную папку ./backup
____________________________
Решение
Для работы используем пакеты java.nio.file и java.io. 
Создаем класс BackupUtility с необходимыми методами. Здесь "./source" и "./backup" это путь папкам. 
source - от куда копируем. backup - куда копируем.

![Task1](https://github.com/Sistomin/JavaCoreHW5/blob/main/Img1.PNG)
____________________________________
________________________________________
2. Предположить, что числа в исходном массиве из 9 элементов имеют диапазон [0,
3], и представляют собой, например, состояния ячеек поля для игры в крестикинолики, где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3
– резервное значение. Такое предположение позволит хранить в одном числе типа
int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта.
____________________________________________________________
Решение
Для хранения 9 значений в трех байтах, можно  использовать тип данных byte. Каждый элемент массива будет представлять собой один байт. Значения [0, 3] легко умещаются в диапазон значений типа byte. 
Создаем класс WriteToFile, в котором инициализируем массив с необходимыми значениями.

Создаем массив bytes и записывает его значения в файл "file_write.dat" с использованием DataOutputStream. 
Значения [0, 3] на самом деле представляют собой байты, и мы сами можем декодировать их при необходимости.
Теперь каждое значение записывается как байт, и всего 9 значений займут 9 байт.

![Task2](https://github.com/Sistomin/JavaCoreHW5/blob/main/Img2.PNG)

_______________________________________
________________________________________
3. Прочитать числа из файла, полученного в результате выполнения задания 2
_______________________________________
Решение
Создан класс ReadFromFile, в нем использаван DataInputStream для считывания байтов из файла "file_write.dat".
Так же в методе реализован вывод в консоль данных из файла. 
При чтении байтов необходимо обрабатывать исключение IOException.

Использование формата .dat в данном случае связано с тем, что мы сохраняем бинарные данные (байты) в файле. 
Расширение файла не является строгим требованием, и можно использовать другие расширения в зависимости от конкретных потребностей проекта. 
Однако расширение .dat часто ассоциируется с файлами данных в бинарном формате.
![Task3](https://github.com/Sistomin/JavaCoreHW5/blob/main/Img3.PNG)
