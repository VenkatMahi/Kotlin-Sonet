package com.example.ngit

class addIT {
    fun getSubjects():ArrayList<table> {
        var list = ArrayList<table>()

        var monday = table("DC 10:00-11:00", "DAA 11:00-1:00", "DBS 2:00-3:40", "", "")
        var tuesday = table("SS 10:00-10:50", "JAVA 11:00-1:00", "DC 2:00-2:50", "OR 2:50-3:40", "")
        var wednesday = table("CO&MP 10:00-10:50", "DAA 11:00-1:00", "DBS 2:00-3:40", "", "")
        var thursday =
            table("OR 10:00-10:50", "JAVA 11:00-1:00", "CO&MP 2:00-2:50", "SS 2:50-3:40", "")
        var friday = table("DBS 9:00-10:50", "DAA 11:00-1:00", "OR 2:00-2:50", "BFE 2:50-3:40", "")
        var saturday =
            table("BFE 10:00-10:50", "JAVA 11:00-1:00", "SS 2:00-2:50", "CO&MP 2:50-3:40", "")
        list.add(monday)
        list.add(tuesday)
        list.add(wednesday)
        list.add(thursday)
        list.add(friday)
        list.add(saturday)

        return list
    }

}