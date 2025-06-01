# frozen_string_literal: true

class Ticket
  NUMERATION_START = 1000 #Constante de clase
  @@numeration = NUMERATION_START - 1 #Variable de clase
  def initialize
    @id = Ticket.increment_and_get
    @items = []
  end
  def self.increment_and_get
    @numeration += 1
  end
  def add(product, amount)
    item = Item.new(product, amount)
    @items << item unless updated_item?(item)
  end

  def updated_item?(item)
    @items.each do |ticket_item|
      if ticket_item == item
        ticket_item.amount += item.amount
        return true
      end
    end
    false
  end

  def to_s
    s = format("TICKET Nº #{@id}\n")
    s += "####################\n"
    @items.each { |e| s += "#{e}\n"}
    s += "####################\n"
    s += "TOTAL #{@total}"
  end
  def total
    @items.map { |e| e.total}.reduce { |accum, e| accum + e }
  end
end
