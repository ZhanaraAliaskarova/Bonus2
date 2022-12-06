package com.example.bonus2

interface Handbaggage{
    fun info()
}

interface Baggage{
    fun info()
}

interface Seat{
    fun info()
}

class HB5: Handbaggage{
    override fun info() {
        println("Hand Baggage 5kg")
    }
}

class NoBaggage: Baggage{
    override fun info() {
        println("No baggage")
    }
}

class BundleSeat: Seat{
    override fun info() {
        println("The seat is given by the system automatically")
    }
}


class HB10: Handbaggage{
    override fun info() {
        println("Hand baggage 10kg")
    }
}

class Baggage20: Baggage{
    override fun info() {
        println("Baggage 20kg")
    }
}

class AnySeat: Seat{
    override fun info() {
        println("Can choose any seat")
    }
}


interface StandartBundle{
    fun makeHandbaggage(): Handbaggage
    fun makeBaggage(): Baggage
    fun makeSeat(): Seat
}

class EconomStandartBundle: StandartBundle{
    override fun makeHandbaggage(): Handbaggage {
        return HB5()
    }

    override fun makeBaggage(): Baggage {
        return NoBaggage()
    }

    override fun makeSeat(): Seat {
        return BundleSeat()
    }
}

class ComfortPlusBundle: StandartBundle {
    override fun makeHandbaggage(): Handbaggage {
        return HB10()
    }

    override fun makeBaggage(): Baggage {
        return Baggage20()
    }

    override fun makeSeat(): Seat {
        return AnySeat()
    }
}

fun main() {
    var handbaggage: Handbaggage
    var baggage: Baggage
    var seat: Seat

    println("Standart bundle")
    val economStandartBundle = EconomStandartBundle()
    handbaggage = economStandartBundle.makeHandbaggage()
    handbaggage.info()

    baggage = economStandartBundle.makeBaggage()
    baggage.info()

    seat = economStandartBundle.makeSeat()
    seat.info()

    println("Comfort Plus Bundle")
    val comfortPlusBundle = ComfortPlusBundle()
    handbaggage = comfortPlusBundle.makeHandbaggage()
    handbaggage.info()

    baggage = comfortPlusBundle.makeBaggage()
    baggage.info()

    seat = comfortPlusBundle.makeSeat()
    seat.info()
}