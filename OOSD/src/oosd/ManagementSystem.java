<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.5" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Component id="jLabel1" pref="1185" max="32767" attributes="0"/>
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace max="-2" attributes="0"/>
              <Component id="jPanel1" max="32767" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
          </Group>
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace min="-2" pref="23" max="-2" attributes="0"/>
              <Component id="jLabel2" min="-2" max="-2" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
              <Component id="lblRoomCount" min="-2" max="-2" attributes="0"/>
              <EmptySpace max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace max="32767" attributes="0"/>
              <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="jLabel2" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="lblRoomCount" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace max="-2" attributes="0"/>
              <Component id="jPanel1" min="-2" max="-2" attributes="0"/>
              <EmptySpace min="-2" max="-2" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Tahoma" size="24" style="0"/>
        </Property>
        <Property name="horizontalAlignment" type="int" value="0"/>
        <Property name="text" type="java.lang.String" value="UWE Bristol Accommodation System"/>
      </Properties>
    </Component>
    <Container class="javax.swing.JPanel" name="jPanel1">

      <Layout>
        <DimensionLayout dim="0">
          <Group type="103" groupAlignment="0" attributes="0">
              <Group type="102" alignment="0" attributes="0">
                  <EmptySpace max="-2" attributes="0"/>
                  <Group type="103" groupAlignment="1" max="-2" attributes="0">
                      <Component id="txtHallNo" max="32767" attributes="0"/>
                      <Component id="txtHallName" alignment="0" max="32767" attributes="0"/>
                      <Component id="lblLeaseNo" alignment="0" min="-2" max="-2" attributes="0"/>
                      <Component id="lblHallName" alignment="0" min="-2" max="-2" attributes="0"/>
                      <Component id="lblHallNo" alignment="0" min="-2" max="-2" attributes="0"/>
                      <Component id="lblRoomNo" alignment="0" min="-2" max="-2" attributes="0"/>
                      <Component id="txtLeaseNo" alignment="0" pref="327" max="32767" attributes="0"/>
                      <Component id="txtRoomNo" max="32767" attributes="0"/>
                  </Group>
                  <EmptySpace min="-2" pref="60" max="-2" attributes="0"/>
                  <Group type="103" groupAlignment="0" max="-2" attributes="0">
                      <Component id="txtStudentID" max="32767" attributes="0"/>
                      <Component id="lblLeaseStart" min="-2" max="-2" attributes="0"/>
                      <Component id="lblCleaningStatus" min="-2" max="-2" attributes="0"/>
                      <Component id="lblStudentName" min="-2" max="-2" attributes="0"/>
                      <Component id="lblStudentID" min="-2" max="-2" attributes="0"/>
                      <Component id="txtStudentName" alignment="0" max="32767" attributes="0"/>
                      <Component id="ddCleaningStatus" alignment="0" max="32767" attributes="0"/>
                      <Component id="txtLeaseStart" alignment="0" min="-2" pref="322" max="-2" attributes="0"/>
                  </Group>
                  <EmptySpace min="-2" pref="27" max="-2" attributes="0"/>
                  <Group type="103" groupAlignment="0" max="-2" attributes="0">
                      <Group type="102" attributes="0">
                          <Component id="btnModifyCreateLease" min="-2" pref="130" max="-2" attributes="0"/>
                          <EmptySpace type="separate" max="-2" attributes="0"/>
                          <Component id="btnDeleteLease" max="32767" attributes="0"/>
                      </Group>
                      <Component id="btnSetCleaningStatus" min="-2" pref="278" max="-2" attributes="0"/>
                  </Group>
                  <EmptySpace max="32767" attributes="0"/>
                  <Component id="btnLogout" min="-2" pref="92" max="-2" attributes="0"/>
                  <EmptySpace min="-2" pref="20" max="-2" attributes="0"/>
              </Group>
              <Group type="102" alignment="0" attributes="0">
                  <Component id="jScrollPane1" min="-2" pref="1157" max="-2" attributes="0"/>
                  <EmptySpace min="0" pref="8" max="32767" attributes="0"/>
              </Group>
          </Group>
        </DimensionLayout>
        <DimensionLayout dim="1">
          <Group type="103" groupAlignment="0" attributes="0">
              <Group type="102" alignment="0" attributes="0">
                  <EmptySpace min="-2" pref="27" max="-2" attributes="0"/>
                  <Component id="jScrollPane1" min="-2" pref="243" max="-2" attributes="0"/>
                  <Group type="103" groupAlignment="0" attributes="0">
                      <Group type="102" attributes="0">
                          <EmptySpace max="-2" attributes="0"/>
                          <Group type="103" groupAlignment="3" attributes="0">
                              <Component id="lblStudentID" alignment="3" min="-2" max="-2" attributes="0"/>
                              <Component id="lblLeaseNo" alignment="3" min="-2" max="-2" attributes="0"/>
                          </Group>
                          <EmptySpace max="-2" attributes="0"/>
                          <Group type="103" groupAlignment="0" max="-2" attributes="0">
                              <Group type="102" attributes="0">
                                  <Group type="103" groupAlignment="3" attributes="0">
                                      <Component id="txtLeaseNo" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="txtStudentID" alignment="3" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <EmptySpace max="-2" attributes="0"/>
                                  <Group type="103" groupAlignment="3" attributes="0">
                                      <Component id="lblHallName" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="lblStudentName" alignment="3" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <EmptySpace max="-2" attributes="0"/>
                                  <Group type="103" groupAlignment="3" attributes="0">
                                      <Component id="txtHallName" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="txtStudentName" alignment="3" min="-2" max="-2" attributes="0"/>
                                  </Group>
                              </Group>
                              <Group type="103" groupAlignment="3" attributes="0">
                                  <Component id="btnModifyCreateLease" alignment="3" min="-2" pref="66" max="-2" attributes="0"/>
                                  <Component id="btnDeleteLease" alignment="3" min="-2" pref="66" max="-2" attributes="0"/>
                              </Group>
                          </Group>
                          <Group type="103" groupAlignment="0" attributes="0">
                              <Group type="102" attributes="0">
                                  <EmptySpace min="-2" pref="7" max="-2" attributes="0"/>
                                  <Group type="103" groupAlignment="3" attributes="0">
                                      <Component id="lblHallNo" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="lblCleaningStatus" alignment="3" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <EmptySpace type="unrelated" max="-2" attributes="0"/>
                                  <Group type="103" groupAlignment="3" attributes="0">
                                      <Component id="txtHallNo" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="ddCleaningStatus" alignment="3" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <EmptySpace max="-2" attributes="0"/>
                                  <Group type="103" groupAlignment="3" attributes="0">
                                      <Component id="lblRoomNo" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="lblLeaseStart" alignment="3" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <EmptySpace max="-2" attributes="0"/>
                                  <Group type="103" groupAlignment="3" attributes="0">
                                      <Component id="txtRoomNo" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="txtLeaseStart" alignment="3" min="-2" max="-2" attributes="0"/>
                                  </Group>
                              </Group>
                              <Group type="102" attributes="0">
                                  <EmptySpace type="separate" max="-2" attributes="0"/>
                                  <Component id="btnSetCleaningStatus" min="-2" pref="83" max="-2" attributes="0"/>
                              </Group>
                          </Group>
                      </Group>
                      <Group type="102" alignment="0" attributes="0">
                          <EmptySpace min="-2" pref="84" max="-2" attributes="0"/>
                          <Component id="btnLogout" min="-2" pref="37" max="-2" attributes="0"/>
                      </Group>
                  </Group>
                  <EmptySpace pref="13" max="32767" attributes="0"/>
              </Group>
          </Group>
        </DimensionLayout>
      </Layout>
      <SubComponents>
        <Container class="javax.swing.JScrollPane" name="jScrollPane1">
          <AuxValues>
            <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
          </AuxValues>

          <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
          <SubComponents>
            <Component class="javax.swing.JTable" name="tblDisplayData">
              <Properties>
                <Property name="autoCreateRowSorter" type="boolean" value="true"/>
                <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
                  <Table columnCount="0" rowCount="4"/>
                </Property>
                <Property name="columnModel" type="javax.swing.table.TableColumnModel" editor="org.netbeans.modules.form.editors2.TableColumnModelEditor">
                  <TableColumnModel selectionModel="0"/>
                </Property>
                <Property name="tableHeader" type="javax.swing.table.JTableHeader" editor="org.netbeans.modules.form.editors2.JTableHeaderEditor">
                  <TableHeader reorderingAllowed="true" resizingAllowed="true"/>
                </Property>
              </Properties>
            </Component>
          </SubComponents>
        </Container>
        <Component class="javax.swing.JTextField" name="txtLeaseNo">
        </Component>
        <Component class="javax.swing.JTextField" name="txtHallName">
        </Component>
        <Component class="javax.swing.JTextField" name="txtRoomNo">
        </Component>
        <Component class="javax.swing.JTextField" name="txtHallNo">
        </Component>
        <Component class="javax.swing.JTextField" name="txtStudentName">
        </Component>
        <Component class="javax.swing.JTextField" name="txtStudentID">
        </Component>
        <Component class="javax.swing.JTextField" name="txtLeaseStart">
        </Component>
        <Component class="javax.swing.JComboBox" name="ddCleaningStatus">
          <Properties>
            <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
              <StringArray count="4">
                <StringItem index="0" value="Item 1"/>
                <StringItem index="1" value="Item 2"/>
                <StringItem index="2" value="Item 3"/>
                <StringItem index="3" value="Item 4"/>
              </StringArray>
            </Property>
            <Property name="toolTipText" type="java.lang.String" value=""/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="ddCleaningStatusActionPerformed"/>
          </Events>
          <AuxValues>
            <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
          </AuxValues>
        </Component>
        <Component class="javax.swing.JLabel" name="lblLeaseNo">
          <Properties>
            <Property name="text" type="java.lang.String" value="Lease Number:"/>
          </Properties>
        </Component>
        <Component class="javax.swing.JLabel" name="lblHallName">
          <Properties>
            <Property name="text" type="java.lang.String" value="Hall Name:"/>
          </Properties>
        </Component>
        <Component class="javax.swing.JLabel" name="lblHallNo">
          <Properties>
            <Property name="text" type="java.lang.String" value="Hall Number:"/>
          </Properties>
        </Component>
        <Component class="javax.swing.JLabel" name="lblRoomNo">
          <Properties>
            <Property name="text" type="java.lang.String" value="Room Number"/>
          </Properties>
        </Component>
        <Component class="javax.swing.JLabel" name="lblStudentID">
          <Properties>
            <Property name="text" type="java.lang.String" value="Student ID:"/>
          </Properties>
        </Component>
        <Component class="javax.swing.JLabel" name="lblStudentName">
          <Properties>
            <Property name="text" type="java.lang.String" value="Student Name:"/>
          </Properties>
        </Component>
        <Component class="javax.swing.JLabel" name="lblLeaseStart">
          <Properties>
            <Property name="text" type="java.lang.String" value="Lease Start Date:"/>
            <Property name="toolTipText" type="java.lang.String" value=""/>
          </Properties>
        </Component>
        <Component class="javax.swing.JLabel" name="lblCleaningStatus">
          <Properties>
            <Property name="text" type="java.lang.String" value="Cleaning Status:"/>
          </Properties>
        </Component>
        <Component class="javax.swing.JButton" name="btnModifyCreateLease">
          <Properties>
            <Property name="text" type="java.lang.String" value="Modify Lease"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnModifyCreateLeaseActionPerformed"/>
          </Events>
        </Component>
        <Component class="javax.swing.JButton" name="btnDeleteLease">
          <Properties>
            <Property name="text" type="java.lang.String" value="Delete Lease"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnDeleteLeaseActionPerformed"/>
          </Events>
        </Component>
        <Component class="javax.swing.JButton" name="btnSetCleaningStatus">
          <Properties>
            <Property name="text" type="java.lang.String" value="Set Cleaning Status"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnSetCleaningStatusActionPerformed"/>
          </Events>
        </Component>
        <Component class="javax.swing.JButton" name="btnLogout">
          <Properties>
            <Property name="text" type="java.lang.String" value="Logout"/>
          </Properties>
          <Events>
            <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnLogoutActionPerformed"/>
          </Events>
        </Component>
      </SubComponents>
    </Container>
    <Component class="javax.swing.JLabel" name="jLabel2">
      <Properties>
        <Property name="text" type="java.lang.String" value="Room Count:"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="lblRoomCount">
      <Properties>
        <Property name="text" type="java.lang.String" value="0"/>
      </Properties>
    </Component>
  </SubComponents>
</Form>
