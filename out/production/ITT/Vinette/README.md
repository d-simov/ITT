Реализирайте структура от класове, която да описва система за закупуване и продажба на винетки от шофьори.

Шофьорът има следните характеристики:
   Име,
   Списък с превозни средства, за които отговаря,
   Пари,
   Бензиностанция, от която пазарува.
Шофьорите могат да си купуват винетки за всички превозни средства, които управляват. Освен това могат да купуват и винетка само за определено превозно
средство по номер (примерно първото) и за определен срок. Когато шофьор купува винетка, той се обръща към бензиностанцията, в която
пазарува и изпълнява съответната операция. Това намалява парите му и освен това той задава новата винетка на съответното
превозно средство, за което я е купил. Последната операция, която извършват шофьорите, е по даден ден, месец и година – текуща дата, да върнат списък с всички 
свои превозни средства с изтекли винетки.

Всяко превозно средство има следните характеристики:
   Модел на превозното средство ,
   Винетка, която е залепена на стъклото му,
   Година на производство.
  
Превозните средства биват : кола, автобус, камион.

Всяка винетка има следните характеристики:
   Дата на издаване – ден, месец и година
   Цвят
   Срок на валидност – дневна, месечна или годишна.

Винетките биват три вида – за кола, за камион, за автобус. Всички винетки за коли са с един и същ цвят. Аналогично и за камиони и автобуси.
Операциите, които се изпълняват върху винетките са :
  • да се залепи на стъклото,
  • да й се вземе цената.

Цената на дневна винетка за кола е 5 лв, за камион – 7 лв., за автобус – 9 лв.
Цените за месец се получават като цените за седмица се умножат по 10.
Цените за година се получават като месечните цени се умножат по 6.

Операцията за залепване връща като резултат колко време отнема една винетка да се залепи – 5 секунди за кола, 10 за камион и 20 за автобус.
Всяка бензиностанция има следните характеристики:
   Оборот за деня,
   Списък с винетки, налични за продажба

Бензиностанцията има следните операции :
  • при създаване да генерира на произволен принцип 10 000 винетки от всякакъв тип (за кола, за камион, за автобус, дневни, месечни, годишни).
Изисква се бензиностанцията да поддържа този списък постоянно сортиран по цена.
  • Бензиностанцията има и операция за продажба на винетка за определено превозно средство и за даден период (дневна, месечна, годишна). След
продажба на винетка останалите трябва да останат, отново в сортирана последователност.

Да се реализира демо програма, която има следните възможности:
      1. Създаване на бензиностанция с автоматично генерирани винетки. Да се изведат на екрана, заедно с техните цена и цвят. 
      2. Създаване на 20 шофьора с произволни имена. Да им се дадат произволна стойност пари. Да им се зададе бензиностанция, от която да пазаруват винетки. 
      3. Създаване на 200 превозни средства от произволен тип (кола, автобус, камион) и на всеки шофьор да се дадат по 10 от тях като всяко превозно средство
се управлява от един шофьор. 
      4. Всеки 3-ти шофьор на произволен принцип за някои превозни средства да купи 5 винетки за произволно генериран срок (ден, месец, година). Останалите
шофьори да купят винетки за всичките си превозни средства за произволно генериран срок. 
      5. Да се изведе информация за всички шофьори – колко коли карат, колко от техните превозни средства имат винетка с изтичащ срок за дадена дата и колко
пари са им останали. 
      6. Да се изведат всички останали винетки в бензиностанцията в сортиран по цена ред.
      7. Да се изведат всички камиони, които имат изтекли винетки за дадена дата.
