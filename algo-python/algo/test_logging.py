
import logging

LOG_FORMAT = "%(levelname)s %(asctime)s - %(message)s"

logging.basicConfig(filename='test.log',
                    level=logging.DEBUG,
                    format=LOG_FORMAT)
log = logging.getLogger()

log.info("what's happening ?")
log.error("failed to execute program")
log.critical("boom!")

print('level=', log.level)
