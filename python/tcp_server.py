import socket

class TCPServer:    
    def __init__(self, TCP_IP, TCP_PORT, BUFFER_SIZE):

        self.TCP_IP = TCP_IP
        self.TCP_PORT = TCP_PORT
        self.BUFFER_SIZE = BUFFER_SIZE
    
        self.s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.s.bind((self.TCP_IP, self.TCP_PORT))
    
    def listen(self):
        self.s.listen(1)
        conn, addr = self.s.accept()
        print('Connection address:', addr)
        while 1:
            data = conn.recv(self.BUFFER_SIZE)
            if not data: break
            print("received data:", data)
            conn.send(1)  # echo
        if data == 'close': conn.close()

server = TCPServer('127.0.0.1', 5005, 1024)
server.listen()