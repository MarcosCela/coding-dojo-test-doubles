from datetime import datetime


class PrintDate:
    def __init__(self):
        pass

    def print_current_date(self):
        print(datetime.now())


if __name__ == '__main__':
    # Do not touch this function or you will be fired!
    # This function must still work once you finish!
    PrintDate().print_current_date()
