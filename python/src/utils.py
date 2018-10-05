# Every decent production code MUST have something called utils right?
from datetime import datetime


class Printer:

    def print(self, print_me: datetime):
        print(print_me)


class CurrentDateProvider:

    def current_date(self) -> datetime:
        return datetime.now()
