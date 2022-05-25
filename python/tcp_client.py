import socket

class TCPClient:

    def __init__(self, TCP_IP, TCP_PORT, BUFFER_SIZE):

        self.TCP_IP = TCP_IP
        self.TCP_PORT = TCP_PORT
        self.BUFFER_SIZE = BUFFER_SIZE
        self.s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.s.connect((TCP_IP, TCP_PORT))

    def sendData(self, data):
        if len(data) > self.BUFFER_SIZE:
            print("Message is too long.")
            return
        else: self.s.send(data)
        print("return: ",self.s.recv(self.BUFFER_SIZE))

    def listen(self):
        while True:
            data = input(">")
            self.sendData(data)
            if data == 'close': return

client = TCPClient('127.0.0.1', 5005, 1024)
client.listen()