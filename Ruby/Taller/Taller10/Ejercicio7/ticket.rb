# frozen_string_literal: true

class Ticket
  NUMERATION_START = 1000 #Constante de clase
  @@numeration = NUMERATION_START - 1 #Variable de clase
  def initialize
    @id = Ticket.increment_and_get
    @items = {}
  end
  def self.increment_and_get
    @numeration += 1
  end
  def add(product, amount)
    @items[product.name] = Item.new(product, 0) unless @items.key?(product.name)
    @items[product.name].amount += amount
  end
  def to_s
    s = format("TICKET Nº #{@id}\n")
    s += "####################\n"
    @items.values.each { |e| s += "#{e}\n"}
    s += "####################\n"
    s += "TOTAL #{@total}"
  end
  def total
    @items.values.map { |e| e.total}.reduce { |accum, e| accum + e }
  end
end
