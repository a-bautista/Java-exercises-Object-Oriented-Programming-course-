
import javax.swing.table.*;
import javax.swing.event.*;
import java.util.LinkedList;

public class Modelo implements TableModel{
    private LinkedList datos = new LinkedList();
    private LinkedList listeners = new LinkedList();

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        return datos.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        Persona aux;

        aux = (Persona)(datos.get(rowIndex));
        switch (columnIndex)
            {
            case 0:
                return aux.setNombre();
            case 1:
                return aux.setApellido();
            case 2:
                return new Integer(aux.setEdad());
            default:
                return null;
        }
    }

    public void borraPersona (int fila)
    {
        datos.remove(fila);
        TableModelEvent evento = new TableModelEvent (this, fila, fila,
            TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
        refresca (evento);
    }

    public void agregaPersona (Persona nuevaPersona)
    {
        datos.add (nuevaPersona);
        TableModelEvent evento;
        evento = new TableModelEvent (this, this.getRowCount()-1,
            this.getRowCount()-1, TableModelEvent.ALL_COLUMNS,
            TableModelEvent.INSERT);
        refresca (evento);
    }

    public void addTableModelListener(TableModelListener l) {
        listeners.add (l);
    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex)
        {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            default:
                return Object.class;
        }
    }

    public String getColumnName(int columnIndex)
    {
        switch (columnIndex)
        {
            case 0:
                return "Nombre";
            case 1:
                return "Apellido";
            case 2:
                return "Edad";
            default:
                return null;
        }
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    public void removeTableModelListener(TableModelListener l) {
        listeners.remove(l);
    }
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        Persona aux;
        aux = (Persona)(datos.get(rowIndex));
        switch (columnIndex)
        {
            case 0:
                aux.getNombre ((String)aValue);
                break;
            case 1:
                aux.getApellido ((String)aValue);
                break;
            case 2:
                aux.getEdad (((Integer)aValue).intValue());
                break;
            default:
                break;
        }

        TableModelEvent evento = new TableModelEvent (this, rowIndex, rowIndex,
            columnIndex);
        refresca (evento);
    }


    private void refresca (TableModelEvent evento)
    {
        int i;
        for (i=0; i<listeners.size(); i++)
            ((TableModelListener)listeners.get(i)).tableChanged(evento);
    }



}
