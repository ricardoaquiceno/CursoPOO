from msilib.schema import Class
from account import Account

class user (Account):

    def __init__(self, id, name, document):
        super.__init__(name, document)

        self.id=id


