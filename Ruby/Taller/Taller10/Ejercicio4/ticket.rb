# frozen_string_literal: true

class Ticket
  NUMERATION_START = 1000 #Constante de clase
  @@numeration = NUMERATION_START - 1 #Variable de clase
  def initialize
    @id = Ticket.increment_and_get
    @items = Set.new
  end
  def self.increment_and_get
    @numeration += 1
  end
  def add(product, amount)
    @items << Item.new(product, amount)
  end
  def to_s
    s = format("TICKET Nº #{@id}\n")
    s += "####################\n"
    @items.sort.each { |e| s += "#{e}\n"}
    s += "####################\n"
    s += "TOTAL #{@total}"
  end
  def total
    @items.map { |e| e.total}.reduce { |accum, e| accum + e }
  end
end
