Разработка на SimpleNotepad, SecuredNotepad

Ще създадем класове репрезентиращи бележник и „защитен“ бележник. За целта, първо създайте клас репрезентиращ страница.

Всяка страница има: 
  заглавие текст Всяка страница ще има следната функционалност: 
    към всяка страница може да се добавя текст 
    текста на всяка станица може да бъде изтриван 
    всяка страница ще може да се преглежда(т.е. метод, който връща String със заглавието и текста на нов ред)

Създайте интерфейс за бележник INotepad: 
Всеки бележник може да: 
  Добавя даден текст към страница с определен номер 
  Добавя даден текст върху страница с определен номер (изтрива предишния и записва новия) 
  Да трие текста от дадена страница Да преглежда всички страници (да принтира на конзолата заглавието и текста)

Направете клас SimpleNotepad, който да е бележник (съдържа в себе си множество страници) Помислете какви полета ще има този клас и какъв конструктор е подходящ. 
Конструктора трябва да е такъв, че след създаването на бележника, той да е готов за работа (т.е. да може да се викат всичките методите за писане, триене, преглеждане...)

Напишете телата на методите, като внимавате за това какви тойности се подават като параметри. Ако някъде видите някаква обща логика, изнесете я на централно ясто 
(в отделен метод).

Създайте бележник SecuredNotepad, който е защитен бележник. 
Всеки един такъв бележник има собствена парола, която се задава при ъздаването му. Бележника може да прави същите неща (писане, триене, принтиране) 
по същия начин като нормален бележник (SimpleNotepad), но преди извършването на всяка операция на бележника, се изисква от отребителя да въведе паролата на бележника. 
Само ако е въведена правилна парола операцията се извършва, в противен случай перацията не се извършва.

Създайте клас NotepadDemo с main метод, където да робвате използването на класовете Page, SimpleNotepad и SecuredNotepad. Пробвайте да дефинирате и еференции от тип 
INotepad а се допълни йерархията от класове по следния начин: 
В класа Page да се създадат следните методи: 
  searchWord(String word) – метода проверява дали думата се съдържа текста на страницата 
  containsDigits() - метода проверява дали текста на страницата ъдържа числа Да се добавят следните методи в интерфейса INotepad:
  searchWord(String word) – проверява дали в някоя страница на ележника се съдържа думата word 
  printAllPagesWithDigits() - метода извежда на екрана съдържанието на сички страници които съдържат цифри Да се създаде интерфейс IЕlectronicDevice с методи: 
  start() - стартира устройството stop() - спира устройството 
  isStarted – проверява дали устройството е пуснато Да се създаде клас ElectronicSecuredNotepad, който е сигурен лектронен бележник. 
  
  За да е възможна каквато и да е операция в/у бележника е нужно той да е пуснат. 
  Естествено, преди всяка операция /у бележника да се изисква от потребителя да въведе паролата на ележника. 
  В класа Demo да се демонстрира употребата на lectronicSecuredNotepad.
