from pydoc import doc

class Account:
    id       = int
    name     = str
    document = str
    password = str
    email    = str
    def __init__(self, name, document):#this will work as the constructor to initialize the class with mandatory fields name and document
        self.name = name
        self. document = document
