package br.uefs.larsid.iot.soft.services;

import java.util.List;

import br.uefs.larsid.iot.soft.model.transactions.Transaction;

/**
 * @author Allan Capistrano, Uellington Damasceno
 * @version 1.0.0
 */
public interface ILedgerReader {
  public List<Transaction> getMessagesByIndex(String index);

  public Transaction getMessageByMessageId(String messageId);

  public void subscribe(String topic, ILedgerSubscriber subscriber);

  public void unsubscribe(String topic, ILedgerSubscriber subscriber);
}
