Лабораторная работа №6: Коллекции и дженерики в Java
Описание

Данная работа посвящена изучению каркаса коллекций Java Collections Framework. В ходе выполнения заданий реализованы алгоритмы обработки текстовых данных, создание собственной структуры данных на основе дженериков и система учета товаров с использованием специализированных коллекций.
Ключевые концепции

Collection — базовый интерфейс для работы с группами объектов

&nbsp;&nbsp;&nbsp;&nbsp;List — упорядоченные списки (ArrayList, LinkedList)

&nbsp;&nbsp;&nbsp;&nbsp;Set — коллекции уникальных элементов (HashSet, TreeSet)

&nbsp;&nbsp;&nbsp;&nbsp;Map — хранилища пар «ключ-значение» (HashMap, TreeMap)

&nbsp;&nbsp;&nbsp;&nbsp;Generics — обобщения для обеспечения типобезопасности кода

&nbsp;&nbsp;&nbsp;&nbsp;Iterator — объект для последовательного обхода элементов коллекции
Содержание заданий

1 Анализ частоты слов (TopWords)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Программа считывает текстовый файл и формирует рейтинг топ-10 самых популярных слов.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Использована коллекция Map<String, Integer> для хранения частоты слов.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Реализована сортировка элементов Map через список и кастомный Comparator.

2 Обобщенный стек (Stack)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Реализован класс Stack<T> на основе массива.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Метод push добавляет элемент в стек.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Метод pop удаляет и возвращает верхний элемент.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Метод peek возвращает верхний элемент без удаления.

3 Система учета продаж (Вариант 4)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Разработана программа для управления данными о продажах в магазине.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Для хранения списка товаров использована коллекция TreeSet, обеспечивающая автоматическую сортировку.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Реализован расчет общей суммы выручки и поиск наиболее популярного товара.
