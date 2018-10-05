from datetime import datetime

from src.utils import Printer, CurrentDateProvider


class PrintDate:
    def __init__(self, printer: Printer=Printer(), date_provider: CurrentDateProvider = CurrentDateProvider()):
        self.printer = printer
        self.current_date_provider = date_provider

    def print_current_date(self):
        self.printer.print(self.current_date_provider.current_date())


if __name__ == '__main__':
    # Do not touch this function or you will be fired!
    # This function must still work once you finish!
    PrintDate().print_current_date()
