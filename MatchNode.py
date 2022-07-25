class Person():
    def __init__(this,name,seed):
        this.Name = name
        this.Seed = seed

    def getName(this):
        return this.Name

    def getSeed(this):
        return this.Seed

class MatchNode():
    def __init__(this, person1, person2, matchID, nextMatch=None):
        this.Person1 = person1
        this.Person2 = person2
        this.MatchID = matchID
        this.Display = person1.getName() != "BYE" and person2.getName() != "BYE"
        this.NextMatch=None
    
    def getPerson1(this):
        return this.Person1
    
    def getPerson2(this):
        return this.Person2

    def getMatchID(this):
        return this.MatchID
    
    def getDisplay(this):
        return this.Display
    
