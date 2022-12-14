package practice.task5;
/*
   Авиакомпания изготавливает три типа самолётов:
   Истребители - не имеют пассажирских мест
   Пассажирские самолёты #1 - имеют места только эконом класса
   Пассажирские самолёты #2 - имеют места эконом и бизнесс класса
   Нужно сделать три метода с одинаковым названием printAirplaneInfo(), который будет выводить
   информацию о самолётах всех трех типов.
   На вход каждый метод будет принимать разное количество параметров:
   название самолета, тип самолета
   название самолета, тип самолета, количество мест эконом класса
   название самолета, тип самолета, количество мест эконом класса, количество мест бизнес класса
   Программа должна выводить на экран такой результат (пример):
   Тип самолета: Jet, модель: F-22 Raptor,
   Тип самолета: Airliner, модель: Aerobus 737, кол. пасажиров эконом класса: 120
   Тип самолета: Airliner, модель: Boeing 777, кол. пасажиров эконом класса: 180, пассажиров бизне скласса: 28
*/
public class Main {
        public static void main(String[] args) {
            AirFighter fighter = new AirFighter("Jet", "F-22 Raptor");
            EcoAirplane ecoplane = new EcoAirplane("Airliner", "Aerobus 737", 120);
            BusAirplane busplane = new BusAirplane("Airliner", "Boeing 777", 180, 28);

            fighter.printAirplaneInfo();
            ecoplane.printAirplaneInfo();
            busplane.printAirplaneInfo();
        }
    }

