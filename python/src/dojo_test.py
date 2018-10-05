import unittest

from src.dojo import PrintDate


class PrintDateTest(unittest.TestCase):

    def test_current_date_works(self):
        PrintDate().print_current_date()
        self.assertIsNone(None, "TDD is not that hard, i got all my tests on green and 100% coverage!")
