package com.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("UNSC - Sistema de reclutamiento")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        setSizeFull();
        setPadding(true);
        setSpacing(true);

        H2 titulo = new H2("UNSC - Sistema de reclutamiento");

        TabSheet tabSheet = new TabSheet();
        tabSheet.setWidthFull();

        tabSheet.add("UNSC - Ramas", crearSeccionArmada());
        tabSheet.add("Divisiones especiales", crearSeccionDivisionesEspeciales());

        add(titulo, tabSheet);
    }

    // Método privado para gestionar la primera entidad
    private Component crearSeccionArmada() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        TextField nombreField = new TextField("Nombre");
        TextField apellidoField = new TextField("Apellido");
        TextField edadField = new TextField("Edad");
        TextField pesoField = new TextField("Peso");
        TextField alturaField = new TextField("Altura");
        Select<String> ramaDeseada = new Select<String>();
        ramaDeseada.setLabel("Rama deseada");
        ramaDeseada.setItems("Armada", "Cuerpo de marines", "Ejercito", "Fuerza Aerea", "Cuerpo Spartan");
        ramaDeseada.setValue("");

        FormLayout form = new FormLayout(idField, nombreField, apellidoField, edadField, pesoField, alturaField, ramaDeseada);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Entidad 1 - Crear: " + nombreField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Entidad 1 - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Entidad 1 - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Entidad 1 - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            apellidoField.clear();
            edadField.clear();
            pesoField.clear();
            alturaField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Descripción").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la segunda entidad
    private Component crearSeccionDivisionesEspeciales() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        Paragraph infoParagraph1 = new Paragraph("Las divisiones especiales son solo para soldados con experiencia, si quiere saber si es apto para prestar servicio en una de estas divisiones por favor diligencie el formulario y se le dará respuesta por tardar en 5 días.");
        Paragraph infoParagraph2 = new Paragraph("United Nations Space Command - UNSC");
        TextField idField = new TextField("ID");
        Select<String> ramaActual = new Select<String>();
        ramaActual.setLabel("Rama Actual");
        ramaActual.setItems("Armada", "Cuerpo de marines", "Ejercito", "Fuerza Aerea", "Cuerpo Spartan");
        ramaActual.setValue("");
        Select<String> divisionDeInteres = new Select<String>();
        divisionDeInteres.setLabel("Division de Interes");
        divisionDeInteres.setItems("Soldado de choque de descenso orbital (ODST)", "Oficina Naval de Inteligencia (ONI)");

        VerticalLayout verticalP = new VerticalLayout(infoParagraph1, infoParagraph2);
        FormLayout form = new FormLayout(idField, ramaActual, divisionDeInteres);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Entidad 2 - Crear: " + ramaActual.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Entidad 2 - Consultar Código: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Entidad 2 - Actualizar Código: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Entidad 2 - Eliminar Código: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            ramaActual.clear();
            divisionDeInteres.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("Código / ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Título").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Categoría").setAutoWidth(true);

        layout.add(verticalP ,form, acciones, grid);
        return layout;
    }
}
