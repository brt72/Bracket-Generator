def ReadListFromFile(filePath):
    file = open(filePath, mode='r')
    nameList = file.read().split('\n')
    file.close()
    print(nameList)
    return nameList

