class Stack:

    def __init__(self):
        self.stack = []

    def add(self, data):
        self.stack.append(data)

    def remove(self):
        del self.stack[-1]
    
    def getSize(self):
        return len(self.stack)

    def removeAll(self):
        for i in len(range(self.stack)):
            del self.stack[i]

class Queue:

    def __init__(self):
        self.queue = []

    def add(self, data):
        self.queue.append(data)

    def remove(self):
        del self.queue[0]
    
    def getSize(self):
        return len(self.queue)

    def removeAll(self):
        for i in len(range(self.queue)):
            del self.stack[i]

    def show(self):
        print(self.queue)

