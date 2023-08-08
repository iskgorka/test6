class ClassExamples {
}
/*
Example 1 - среднее значение элементов массива
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i = nums.length - 1; // 4
        for (; i >= 0; i--) {
            result = result + nums[i];
            System.out.println("nums[" + i + "] " + nums[i]);
        }
        System.out.println("Среднее значение равно " + result / 5);

Example 2 -
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String s = "Try to check";
        System.out.println("Введите числа от 1 до 5 ");
        str = br.readLine();
        str = str.trim();
        switch (str) {
            case "1":
            case "2":
                System.out.println("Ввели " + str);
                break;
            case "3":
            case "4":
            case "5":
                if (str.contains("4") | str.contains("5")) {
                    s = s.replace('y', 'N');
                    str = str + " " + s.toUpperCase();
                }
                System.out.println("Ввели " + str);
                break;
            default:
                int twoD[][] = new int[4][5];
                int i, j, k = 0;
                for (i = 0; i < 4; i++)
                    for (j = 0; j < 5; j++) {
                        twoD[i][j] = k;
                        k++;
                    }
                for (i = 0; i < 4; i++) {
                    for (j = 0; j < 5; j++)
                        System.out.print(twoD[i][j] + " ");
                    System.out.println();
                }
        }

Inheritance Example 1
        class A {
            int i, j;
            void showij() {
                System.out.println("i and j " + i + " " + j);
            }
        }
        //создать подкласс B путём расширения класса A
        class B extends A {
            int k;
            void showk() {
                System.out.println("k: " + k);
            }
            void sum() {
                System.out.println("i + j + k: " + (i + j + k));
            }
        }
        class SimpleInheritance {
            public static void main(String[] args) {
                A superOb = new A();
                B subOb = new B();
        //суперкласс может использоваться самостоятельно
                superOb.i = 10;
                superOb.j = 20;
                System.out.println("Содержимое объекта superOb: ");
                superOb.showij();
                System.out.println();
        //подкласс имеет доступ ко всем открытым элементам своего суперкласса
                subOb.i = 7;
                subOb.j = 8;
                subOb.k = 9;
                System.out.println("Содержимое объекта subOb: ");
                subOb.showij();
                subOb.showk();
                System.out.println();
                System.out.println("Сумма: ");
                subOb.sum();
            }
        }

Inheritance Example 2
        //В иерархии классов закрытые элементы остаются закрытыми в пределах своего класса.
        class A {
            int i;
            private int j;
            void setij(int in, int jn) {
                i = in;
                j = jn;
            }
        }
        //элемент j класса А недоступен в классе B
        class B extends A {
            int total;
            void sum() {
                total = i + j; //ОШИБКА: элемент j недоступен в этом классе
            }
        }
        class Access {
            public static void main(String args[]) {
                B subOb = new B();
                subOb.setij(10,12);
                subOb.sum();
                System.out.println("Сумма равна: " + subOb.total);
            }
        }

Inheritance Example 3
        class Box {
            double width;
            double height;
            double depth;
        //Сконструировать клон объекта
            Box(Box ob) { //передать объект конструктору
                width = ob.width;
                height = ob.height;
                depth = ob.depth;
            }
        //Конструктор при указании всех размеров
            Box(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
            }
        //Конструктор, используемый, когда ни один из размеров не указан
            Box() {
                width = -1;
                height = -1;
                depth = -1;
            }
        //Конструктор, применяемый при создании куба
            Box(double len) {
                width = height = depth = len;
            }
        //Расчитать и возвратить объем
            double volume() {
                return width * height * depth;
            }
        }
        //расширить класс Box, добавив в него поле веса
        class BoxWeight extends Box {
            double weight; //вес параллелепипеда
            BoxWeight(double w, double h, double d, double m) {
                width = w;
                height = h;
                depth = d;
                weight = m;
            }
        }
        class BoxWeightDemo {
            public static void main(String args[]) {
                BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
                BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
                double vol;
                vol = mybox1.volume();
                System.out.println("Объем mybox1 равен: " + vol);
                System.out.println("Вес mybox1 равен: " + mybox1.weight);
                System.out.println();
                vol = mybox2.volume();
                System.out.println("Объем mybox2 равен: " + vol);
                System.out.println("Вес mybox2 равен: " + mybox2.weight);
            }
        }

Inheritance Example 4
        //В этой программе наследование применяется для расширения класса Box
        class Box {
            double width;
            double height;
            double depth;
            //Сконструировать клон объекта
            Box(Box ob) { //передать объект конструктору
                width = ob.width;
                height = ob.height;
                depth = ob.depth;
            }
            //Конструктор при указании всех размеров
            Box(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
            }
            //Конструктор, используемый, когда ни один из размеров не указан
            Box() {
                width = -1;
                height = -1;
                depth = -1;
            }
            //Конструктор, применяемый при создании куба
            Box(double len) {
                width = height = depth = len;
            }
            //Расчитать и возвратить объем
            double volume() {
                return width * height * depth;
            }
        }

        class ColorBox extends Box {
            int color; //цвет параллелепипеда
            ColorBox(double w, double h, double d, int c) {
                width = w;
                height = h;
                depth = d;
                color = c;
            }
        }

Inheritance Example 5
        class Box {
            double width;
            double height;
            double depth;
            double volume() {
                return width * height * depth;
            }
        }
        class BoxWeight extends Box {
            double weight; //вес параллелепипеда
            BoxWeight(double w, double h, double d, double m) {
                width = w;
                height = h;
                depth = d;
                weight = m;
            }
        }
        class RefDemo {
            public static void main(String args[]) {
                Box box = new Box();
                BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
                double vol;
                vol = weightbox.volume();
                System.out.println("Объем weightbox равен: " + vol);
                System.out.println("Вес weightbox равен: " + weightbox.weight);
                System.out.println();
        //Присвоить ссылке на объект BoxWeight ссылки на объект Box
                box = weightbox;
                vol = box.volume(); //Верно, так как метод volume() определён в классе Box
                System.out.println("Объем box равен: " + vol);
        //Ошибка, поскольку объект box не определяет элемент weight
                System.out.println("Вес box равен" + box.weight);
        //Ссылка на объект класса Box не предоставляет доступ к полю weight посколько оно не определено в классе Box
            }
        }

Inheritance Example 6
        class Box {
            double width;
            double height;
            double depth;
            //Сконструировать клон объекта
            Box(Box ob) { //передать объект конструктору
                width = ob.width;
                height = ob.height;
                depth = ob.depth;
            }
            //Конструктор при указании всех размеров
            Box(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
            }
            //Конструктор, используемый, когда ни один из размеров не указан
            Box() {
                width = -1;
                height = -1;
                depth = -1;
            }
            //Конструктор, применяемый при создании куба
            Box(double len) {
                width = height = depth = len;
            }
            //Расчитать и возвратить объем
            double volume() {
                return width * height * depth;
            }
        }
        //Теперь в классе BoxWeight ключевое слово super используется для инициализации собственных свойств объекта типа Box
        class BoxWeight extends Box {
            double weight; //вес параллелепипеда
            //инициализировать поля width, height, depth с помощью метода super()
            BoxWeight(double w, double h, double d, double m) {
                super(w,h,d); // вызвать конструктор суперкласса
                weight = m;
            }
        }

Inheritance Example 7 - Полная реализация класса BoxWeight
        class Box {
            private double width;
            private double height;
            private double depth;
            //Сконструировать клон объекта
            Box(Box ob) { //передать объект конструктору
                width = ob.width;
                height = ob.height;
                depth = ob.depth;
            }
            //Конструктор при указании всех размеров
            Box(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
            }
            //Конструктор, используемый, когда ни один из размеров не указан
            Box() {
                width = -1;
                height = -1;
                depth = -1;
            }
            //Конструктор, применяемый при создании куба
            Box(double len) {
                width = height = depth = len;
            }
            //Расчитать и возвратить объем
            double volume() {
                return width * height * depth;
            }
        }
        //Теперь в классе BoxWeight полностью реализованы все констуркторы
        class BoxWeight extends Box {
            double weight; //вес параллелепипеда
            //Сконструировать клон объекта
            BoxWeight(BoxWeight ob) { //передать объект конструктору
                super(ob);
                weight = ob.weight;
            }
            //Конструктор, применяемый при указании всех параметров
            BoxWeight(double w, double h, double d, double m) {
                super(w,h,d); //вызвать констурктор из суперкласса
                weight = m;
            }
            //Конструктор по умолчанию
            BoxWeight() {
                super();
                weight = -1;
            }
            //Конструктор применяемый при создании куба
            BoxWeight(double len, double m) {
                super(len);
                weight = m;
            }
        }
        class DemoSuper {
            public static void main(String args[]){
                BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
                BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
                BoxWeight mybox3 = new BoxWeight(); // по умолчанию
                BoxWeight mycube = new BoxWeight(3,2);
                BoxWeight myclone = new BoxWeight(mybox1);
                double vol;
                vol = mybox1.volume();
                System.out.println("Объем mybox1 равен: " + vol);
                System.out.println("Вес mybox1 равен: " + mybox1.weight);
                System.out.println();
                vol = mybox2.volume();
                System.out.println("Объем mybox2 равен: " + vol);
                System.out.println("Вес mybox2 равен: " + mybox2.weight);
                System.out.println();
                vol = mybox3.volume();
                System.out.println("Объем mybox3 равен: " + vol);
                System.out.println("Вес mybox3 равен: " + mybox3.weight);
                System.out.println();
                vol = mycube.volume();
                System.out.println("Объем mycube равен: " + vol);
                System.out.println("Вес mycube равен: " + mycube.weight);
                System.out.println();
                vol = myclone.volume();
                System.out.println("Объем myclone равен: " + vol);
                System.out.println("Вес myclone равен: " + myclone.weight);
            }
        }

Inheritance Example 8
        //Использовать ключевое слово super с целью предотвратить сокрытие имён
        class A {
            int i;
        }
        //создать подкласс путем расширения класса А
        class B extends A {
            int i; //этот элемент i скрывает элемент i из класса А
            B(int a, int b){
                super.i = a; //элемент i из класса А
                i = b; //элемент i из класса В
            }
            void show(){
                System.out.println("элемент i в суперклассе А: " + super.i);
                System.out.println("элемент i в подклассе В: " + i);
            }
        }
        class UseSuper {
            public static void main(String args[]){
                B subOb = new B(1,2);
                subOb.show();
            }
        }

Inheritance Example 9
        class Box {
            private double width;
            private double height;
            private double depth;
            Box(Box ob) {
                width = ob.width;
                height = ob.height;
                depth = ob.depth;
            }
            Box(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
            }
            Box() {
                width = -1;
                height = -1;
                depth = -1;
            }
            Box(double len) {
                width = height = depth = len;
            }
            double volume() {
                return width * height * depth;
            }
        }
        class BoxWeight extends Box {
            double weight;
            BoxWeight(BoxWeight ob) {
                super(ob);
                weight = ob.weight;
            }
            BoxWeight(double w, double h, double d, double m) {
                super(w,h,d);
                weight = m;
            }
            BoxWeight() {
                super();
                weight = -1;
            }
            BoxWeight(double len, double m) {
                super(len);
                weight = m;
            }
        }
        class Shipment extends BoxWeight {
            double cost;
            Shipment(Shipment ob){
                super(ob);
                cost = ob.cost;
            }
            Shipment(double w, double h, double d, double m, double c){
                super(w,h,d,m);
                cost = c;
            }
            Shipment() {
                super();
                cost = -1;
            }
            Shipment(double len, double m, double c){
                super(len, m);
                cost = c;
            }
        }
        class DemoShipment {
            public static void main(String args[]) {
                Shipment shipment1 = new Shipment(10,20,15,10,3.41);
                double vol;
                vol = shipment1.volume();
                System.out.println("Объем shipment1: " + vol);
                System.out.println("Вес shipment1: " + shipment1.weight);
                System.out.println("Стоимость доставки shipment1: " + shipment1.cost);
            }
        }

Inheritance Example 10
        class A {
            A(){
                System.out.println("Конструктор класса А");
            }
        }
        class B extends A {
            B(){
                System.out.println("Конструктор класса B");
            }
        }
        class C extends B {
            C(){
                System.out.println("Конструктор класса C");
            }
        }
        class CollingCons {
            public static void main(String[] args){
                C c = new C(); // A B C
            }
        }

Inheritance Example 11
        class A {
            int i, j;
            A(int i, int j){
                this.i = i;
                this.j = j;
            }
            void show(){
                System.out.println("i and j: " + i + " " + j);
            }
        }
        class B extends A {
            int k;
            B(int i, int j, int k){
                super(i,j);
                this.k = k;
            }
            void show(){
                System.out.println("k: " + k);
            }
        }
        class Override {
            public static void main(String[] args) {
                B subOb = new B(1, 2, 3);
                subOb.show(); // k = 3
            }
        }

Inheritance Example 12
        class A {
            int i, j;
            A(int i, int j){
                this.i = i;
                this.j = j;
            }
            void show(){
                System.out.println("i and j: " + i + " " + j);
            }
        }
        class B extends A {
            int k;
            B(int i, int j, int k){
                super(i,j);
                this.k = k;
            }
            void show(){
                super.show();
                System.out.println("k: " + k);
            }
        }
        class Override {
            public static void main(String[] args) {
                B subOb = new B(1, 2, 3);
                subOb.show(); // k = 3
            }
        }

Inheritance Example 13
        class A {
            int i, j;
            A(int i, int j){
                this.i = i;
                this.j = j;
            }
            void show(){
                System.out.println("i and j: " + i + " " + j);
            }
        }
        class B extends A {
            int k;
            B(int i, int j, int k){
                super(i,j);
                this.k = k;
            }
        //перегрузить метод show()
            void show(String msg){
                System.out.println(msg + k);
            }
        }
        class Override {
            public static void main(String[] args) {
                B subOb = new B(1, 2, 3);
                subOb.show("k: "); //вызвать метод show из класса B
                subOb.show(); //вызвать метод show из класса A
            }
        }

Inheritance Example 14
        //Приминение динамичесского полиморфизма
        class Figure {
            double dim1;
            double dim2;
            Figure(double a, double b){
                dim1 = a;
                dim2 = b;
            }
            double area(){
                System.out.println("Площадь фигуры не определена.");
                return 0;
            }
        }
        class Rectangle extends Figure {
            Rectangle(double a, double b){
                super(a, b);
            }
            //переопределить метод area() для четырехугольника
            double area(){
                System.out.println("В области четырехугольника.");
                return dim1 * dim2;
            }
        }
        class Triangle extends Figure {
            Triangle(double a, double b){
                super(a, b);
            }
            //переопределить метод area() для прямоугольного треугольника
            double area(){
                System.out.println("В области треугольника.");
                return dim1 * dim2 / 2;
            }
        }
        class FindAreas {
            public static void main(String[] args){
                Figure f = new Figure(10,10);
                Rectangle r = new Rectangle(9,5);
                Triangle t = new Triangle(10,8);
                Figure figref;
                figref = f;
                System.out.println("Площадь равна: " + figref.area());
                figref = r;
                System.out.println("Площадь равна: " + figref.area());
                figref = t;
                System.out.println("Площадь равна: " + figref.area());
            }
        }

Inheritance Example 15
        abstract class A {
            abstract void callMe();
            //абстрактные классы могут содержать так же конкретные методы
            void callMeToo(){
                System.out.println("Это конкретный метод");
            }
        }
        class B extends A {
            void callMe() {
                System.out.println("Реализация метода callMe в классе B.");
            }
        }
        class AbstractDemo {
            public static void main(String[] args){
                B b = new B();
                b.callMe();
                b.callMeToo();
            }
        }

Inheritance Example 16
        abstract class Figure {
            double dim1;
            double dim2;
            Figure(double a, double b){
                dim1 = a;
                dim2 = b;
            }
        // метод area() является абстрактным
            abstract double area();
        }
        class Rectangle extends Figure {
            Rectangle(double a, double b){
                super(a, b);
            }
        //переопределить метод area() для четырехугольника
            double area(){
                System.out.println("В области четырехугольника.");
                return dim1 * dim2;
            }
        }
        class Triangle extends Figure {
            Triangle(double a, double b){
                super(a, b);
            }
        //переопределить метод area() для прямоугольного треугольника
            double area(){
                System.out.println("В области треугольника.");
                return dim1 * dim2 / 2;
            }
        }
        class FindAreas {
            public static void main(String[] args){
                //Figure f = new Figure(10,10);
                Rectangle r = new Rectangle(9,5);
                Triangle t = new Triangle(10,8);
                Figure figref;
                figref = r;
                System.out.println("Площадь равна: " + figref.area());
                figref = t;
                System.out.println("Площадь равна: " + figref.area());
            }
        }

Inheritance Example 17
        class A {
            final void meth(){
                System.out.println("Это конечный метод.");
            }
        }
        class B extends A {
            void meth() { //ОШИБКА! Этот метод не может быть переопределён
                System.out.println("Недоступно.");
            }
        }

Inheritance Example 18
        final class A {

        }
        //следующий класс невозможен
        class B extends A {
            //ОШИБКА! Класс А не может иметь подклассы
        }
*/