# frozen_string_literal: true

class Restaurant

  def initialize(name)
    @name = name
    @sections = {}
  end

  def add_table(section, table_name, max_table_amount)
    @sections[section] = Set.new unless @sections.key?(section) #Es sorted set
    @sections[section] << Table.new(table_name, max_table_amount)
  end

  def tables(section)
    raise ArgumentError, 'Section does not exists' unless @sections.key?(section)
    @sections[section]
  end
  def tables_count(section) = tables(section).size
  def sections_count
    @sections.size
  end
end
