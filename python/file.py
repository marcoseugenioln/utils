import os
import shutil

class File:

    def isPath(path):
        if os.path.exists(path):
            return True
        else:
            return False

    def isFile(path):
        if File.isPath(path):
            if os.path.isfile(path):
                return True
            else:
                return False
        else:
            return False

    def isFile(path):
        if File.isPath(path):
            if os.path.isdir(path):
                return True
            else:
                return False
        else:
            return False

    def move(src, dst):
        if File.isPath(src):
            shutil.move(src, dst)

    def remove(path):
        if File.isPath(path):
            os.remove(path)


