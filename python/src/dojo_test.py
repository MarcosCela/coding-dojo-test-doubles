import unittest
from datetime import datetime
from unittest.mock import MagicMock

from src.dojo import PrintDate
from src.utils import Printer, CurrentDateProvider

TEST_DATE = datetime.utcfromtimestamp(0)


class PrintDateTest(unittest.TestCase):

    def test_current_date_works(self):
        # Setup
        printer = MagicMock(spec=Printer)
        date_provider = CurrentDateProvider()
        date_provider.current_date = MagicMock(return_value=TEST_DATE)

        # Test
        PrintDate(printer, date_provider).print_current_date()

        # Assert
        printer.print.assert_called_once_with(TEST_DATE)
        date_provider.current_date.assert_called_once()

