package com.kodilla.transfersrealizationservice.service;

import com.kodilla.commons.TransferMessage;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TransferListener {

  @KafkaListener(topics = "transfers")
  public void consume(@Payload TransferMessage transferMessage) throws IOException {
    log.info("Consumed transferMessage: {}", transferMessage);
  }
}
